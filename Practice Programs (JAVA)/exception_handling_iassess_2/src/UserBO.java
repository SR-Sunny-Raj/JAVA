
public class UserBO {
    // Your code here
    public static void validate(User u) throws WeakPasswordException {
        String pass = u.getPassword();
        if (pass.length() < 10 || pass.length() > 20) {
            throw new WeakPasswordException("Your password is weak");
        }
        boolean case2 = false, case3 = false, case4 = false;
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (ch >= 48 && ch <= 57) {
                case2 = true;
            }
            if (!((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) {
                case3 = true;
            }
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                case4 = true;
            }
        }
        if (!(case2 && case3 && case4)) {
            throw new WeakPasswordException("Your password is weak");
        }
    }
}
