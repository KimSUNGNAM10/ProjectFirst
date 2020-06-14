package stages_pack;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageController implements Initializable {
	@FXML
	TableView<Student> tableView;
	@FXML
	Button btnAdd, btnChart;

	ObservableList<Student> scores;

//	Stage primaryStage;
//	void setPrimaryStage(Stage primaryStage) {
//		this.primaryStage = primaryStage;
//	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		scores = FXCollections.observableArrayList(); // 인스턴스 초기화를 해줘야됨

		// btnAdd.setOnAction(e -> buttonAddAction(e)); 람다식
		btnAdd.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				buttonAddAction(arg0);
			}
		});

		btnChart.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				buttonChartAction(arg0);
			}
		});
		// root.fxml과 student class 매칭
		TableColumn<Student, ?> tcName = tableView.getColumns().get(0);
		tcName.setCellValueFactory(new PropertyValueFactory("name"));

		TableColumn<Student, ?> tcKorean = tableView.getColumns().get(1);
		tcKorean.setCellValueFactory(new PropertyValueFactory("korean"));

		TableColumn<Student, ?> tcMath = tableView.getColumns().get(2);
		tcMath.setCellValueFactory(new PropertyValueFactory("math"));

		TableColumn<Student, ?> tcEnglish = tableView.getColumns().get(3);
		tcEnglish.setCellValueFactory(new PropertyValueFactory("english"));

		tableView.setItems(scores);

	}

	public void buttonAddAction(ActionEvent ae) { // window style 지정
		Stage addStage = new Stage(StageStyle.UTILITY);
		addStage.initModality(Modality.WINDOW_MODAL);
		addStage.initOwner(btnAdd.getScene().getWindow());

		try {
			Parent parent = FXMLLoader.load(getClass().getResource("AddForm.fxml"));
			Scene scene = new Scene(parent);
			addStage.setResizable(false);
			addStage.setScene(scene);
			addStage.show();

			Button btnFormAdd = (Button) parent.lookup("#btnFormAdd"); // lookup은 btnFormAdd하위에 있는 id를 불어올때, #id값가져올때
			btnFormAdd.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					TextField txtName = (TextField) parent.lookup("#txtName");
					TextField txtKorean = (TextField) parent.lookup("#txtKorean");
					TextField txtMath = (TextField) parent.lookup("#txtMath");
					TextField txtEnglish = (TextField) parent.lookup("#txtEnglish");

					Student student = new Student(txtName.getText(), 
							Integer.parseInt(txtKorean.getText()),
							Integer.parseInt(txtMath.getText()), 
							Integer.parseInt(txtEnglish.getText()));
					scores.add(student);
					addStage.close();
				}

			});

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void buttonChartAction(ActionEvent ae) {
		Stage chartStage = new Stage(StageStyle.UTILITY);
		chartStage.initModality(Modality.WINDOW_MODAL);
		chartStage.initOwner(btnAdd.getScene().getWindow());
//		chartStage.initOwner(primaryStage);
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("ScoreChart.fxml"));
				BarChart barChart = (BarChart) parent.lookup("#barChart");
				
				XYChart.Series<String, Integer> serieskorean
					= new XYChart.Series<String, Integer>();
				ObservableList<XYChart.Data<String, Integer>> dataskorean 
				= FXCollections.observableArrayList();
				for(int i=0; i<scores.size(); i++) {
					dataskorean.add(new XYChart.Data(scores.get(i).getName(), scores.get(i).getkorean()));
					// 이름 국어점수
				}
				serieskorean.setData(dataskorean);
				serieskorean.setName("국어");
				
				XYChart.Series<String, Integer> seriesMath
				= new XYChart.Series<String, Integer>();
			ObservableList<XYChart.Data<String, Integer>> datasMath 
			= FXCollections.observableArrayList();
			for(int i=0; i<scores.size(); i++) {
				datasMath.add(new XYChart.Data(scores.get(i).getName(), scores.get(i).getMath()));
				// 이름 수학점수
			}
			seriesMath.setData(datasMath);
			seriesMath.setName("수학");
			
			XYChart.Series<String, Integer> seriesEnligsh
			= new XYChart.Series<String, Integer>();
		ObservableList<XYChart.Data<String, Integer>> datasEnligsh 
		= FXCollections.observableArrayList();
		for(int i=0; i<scores.size(); i++) {
			datasEnligsh.add(new XYChart.Data(scores.get(i).getName(), scores.get(i).getEnglish()));
			// 이름 영어점수
		}
		seriesEnligsh.setData(datasEnligsh);
		seriesEnligsh.setName("영어");
			
				
				barChart.setData(FXCollections.observableArrayList(serieskorean, seriesMath, seriesEnligsh));
				
				Scene scene = new Scene(parent);
				chartStage.setScene(scene);
				chartStage.show();
				chartStage.setResizable(false);
				
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
