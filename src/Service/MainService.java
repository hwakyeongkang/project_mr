package Service;

import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;

public interface MainService {
	public void setFont(Parent root);
	public void setToday(Parent root);
	public void setDday(Parent root);
	public Parent loginForm();
	public void selExhibition(MouseEvent e);
	public Parent myRsvForm();
}
