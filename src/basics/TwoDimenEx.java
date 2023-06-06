package basics;

public class TwoDimenEx {



	public static void main(String[] args) {

		int marks1[]= {12,45,90};

		int marks[][] = new int[3][3]; //[rows][columns]

		//first row
		marks[0][0]=86;
		marks[0][1]=78;
		marks[0][2]=89;

		//second row
		marks[1][0]=90;
		marks[1][1]=34;
		marks[1][2]=67;

		//third row
		marks[2][0]=56;
		marks[2][1]=23;
		marks[2][2]=33;

		for (int i=0; i<marks.length;i++)
		{
			for(int j=0; j<marks.length;j++)
			{
				System.out.println(marks[i][j]);
				/*
					[0][0]=86
					[0][1]=78
					[0][2]=89

					[1][0]=90
					[1][1]=34
					[1][2]=67

					[2][0]=56
					[2][1]=23
					[2][2]=33
				 */
			}
		}

		//second way of creating 2 dimensional array
		int marks2[][]=  
			{
					{45,46,89},
					{23,67,90},
					{56,89,24}
			};
	}


}





