class CNBeautifulString{
	
	public static int makeBeautiful(String str) {
    int count = 0;
    StringBuilder sb = new StringBuilder(str);

    for (int i = 0; i < sb.length(); i++) {
        for (int j = i + 1; j < sb.length(); j++) {
            if (sb.charAt(i) == sb.charAt(j) && sb.charAt(i) == '0') {
                sb.setCharAt(j, '1');
                count++;
            } else if (sb.charAt(i) == sb.charAt(j) && sb.charAt(i) == '1') {
                sb.setCharAt(j, '0');
                count++;
            }
        }
    }

    return count;
	}

	public static void main(String[] args){

		String string = "1001";
		System.out.print(makeBeautiful(string));
	}
}