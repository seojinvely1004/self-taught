package array;

public class Ex5_6 {

	public static void main(String[] args) {
		String[] names = new String[]{"Kim", "Park", "Yi"};
		
		for(int i = 0; i < names.length; i++)
			System.out.println("names["+ i + "]:" + names[i]);
		
		String tmp = names[2];//�迭 names�� �� ��° ��Ҹ� tmp�� �����Ѵ�
		System.out.println("tmp:" + tmp);
		names[0] = "Yu";//�迭 NAMES�� ù ��° ��Ҹ� "Yu"�� �����Ѵ�
		
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);

	}

}
