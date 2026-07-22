package dsa;

public class LongestCommonPrefix25062026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "flower", "flow", "flight" };

		String res = find(str);
		System.out.println(res);

	}

	private static String find(String[] strs) {
		int minLength = Integer.MAX_VALUE;
		for (String st : strs) {
			minLength = Math.min(minLength, st.length());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < minLength; i++) {
			char ch = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (ch != strs[j].charAt(i)) {
					return sb.toString();
				}
			}
			sb.append(ch);
		}
		return sb.toString();
	}

}
