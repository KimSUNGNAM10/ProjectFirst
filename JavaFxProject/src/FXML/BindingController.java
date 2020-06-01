package FXML;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

public class BindingController implements Initializable{
	@FXML TextArea txtArea1;
	@FXML TextArea txtArea2;
	@FXML Label label;
	@FXML Slider slider;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {//속성이 바뀔때마다 처리

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number oldVal, Number newVal) {
				label.setFont(new Font(newVal.doubleValue()));
			}
		});
		
	//	txtArea2.textProperty().bind(txtArea1.textProperty()); // 2번이 1한테 묶임
//		txtArea2.textProperty().bindBidirectional(txtArea1.textProperty()); 서로에게 묶임
		Bindings.bindBidirectional(txtArea1.textProperty(), txtArea2.textProperty());//서로
		
	}

}
