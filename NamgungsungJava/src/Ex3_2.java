
public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5, j = 0;
		j = i++;
		System.out.println("j=i++; ���� ��, i=" + i + ",j="+j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i; ���� ��, i=" + i + "j,j="+j );
		
		i = 5;
		j = 5;
		System.out.println(i++);//i���� ��� �� 1 ����
		System.out.println(++j);//j���� 1 ���� �� ���
		System.out.println("i = " + i + ",j=" + j);

	}

}
