import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;



public class OkJavaGoInHome {

	public static void main(String[] args) {


//		//Elevator call		
//		Elevator myElevator = new Elevator("JAVA APT 507 ");
//		myElevator.callForUp(1);//�� �ö󰥰ǵ� 1������ ���������� ���� 
//
//		//Security off
//		Security mySecurity = new Security("JAVA APT 507");
//		mySecurity.off();
//
//		//Light on //ctrl + space�� ����Ʈ �ϱ� 
//		Lighting hallLamp = new Lighting("JAVA APT 507 / Hall Lamp");
//		hallLamp.on();
//
//		Lighting floorLamp = new Lighting("JAVA APT 507 / floorLamp");
//		floorLamp.on();

		String id = "JAVA APT 507";
		
		//Elevator call		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);//�� �ö󰥰ǵ� 1������ ���������� ���� 

		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();

		//Light on //ctrl + space�� ����Ʈ �ϱ� 
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();


	}

}
