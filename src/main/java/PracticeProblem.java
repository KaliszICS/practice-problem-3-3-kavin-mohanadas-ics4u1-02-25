import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static ArrayList<String> perms(String str) {
		ArrayList<String> list = new ArrayList<>();

		if (str.length() == 0) {
			list.add("");
			return list;

		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			ArrayList<String> subPerms = perms(remaining);
			for (String s : subPerms) {
				list.add(c + s);
			}
		}
		return list;
	}

	public static ArrayList<String> permsUnique(String str) {
		ArrayList<String> allPerms = perms(str);
		ArrayList<String> uniquePerms = new ArrayList<>();

		for (int i = 0; i < allPerms.size(); i++) {
			String permutation = allPerms.get(i);
			if (!uniquePerms.contains(permutation)) {
				uniquePerms.add(permutation);
			}
		}
		return uniquePerms;
		}

}
