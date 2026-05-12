package RefineSwitch;

public class ExpressionSwitch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g=74;
		String grade=switch(g/10) {
		case 10,9 ->{
			 yield "A";
		}
		case 8->{
			yield "B";
		}
		case 7->{
			yield "C";
		}
		default -> {
			yield "d";
		}
		};
		System.out.println(grade);
		
		}

	}


