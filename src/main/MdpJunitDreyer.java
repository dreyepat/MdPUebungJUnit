package main;

public class MdpJunitDreyer implements MdpJunitDemo {

	@Override
	public String capitalize(String s) {
		s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
		return s;
	}

	@Override
	public boolean isEmpty(String s) {
		if(s == null || s == ""){
			return true;
		}
		else {return false;
		}
	}

	@Override
	public String join(String... strings) {
		String s = "";
		int counter = 0;
		for(String string: strings){
			counter++;
			s = s + string;
			if(counter < strings.length){
				s = s + " ";
			}
		}

		return s;
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		s = new StringBuffer(s).reverse().toString();
		return s;
	}

}
