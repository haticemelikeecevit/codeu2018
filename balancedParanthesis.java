        import java.util.Stack;

        public class balancedParanthesis {
            public static void main ( String[] args) {
                System.out.println(isBalanced("((())())"));
                System.out.println(isBalanced("))(("));
                System.out.println(balancedPars("( ) ) ( ( ) )"));
            }
            public static int balancedPars (String s) {
                s = s.replaceAll(" ","");
                System.out.println(s);
                int maxlength = 0;
                if (s.length() == 0)
                    return 0;
                if (isBalanced(s))
                    return s.length();
                else{
                    for (int i = 0; i < s.length(); i++) {
                        for (int j = s.length(); j >= i; j--) {
                            System.out.println(s.substring(i,j));
                            if (isBalanced(s.substring(i, j)) && s.substring(i, j).length() > maxlength)
                                maxlength = s.substring(i, j).length();}
                    }
                   /* for (int j = s.length(); j > 0; j--) {
                        for (int i = 0; i < j; i++) {
                            System.out.println(s.substring(i,j));
                            if (isBalanced(s.substring(i,j)) && s.substring(i,j).length() > maxlength)
                                maxlength = s.substring(i,j).length();
                        }
                    }*/
                    return maxlength;
                }
            }
            public static boolean isBalanced ( String s ) {
                Stack<Character> pars = new Stack<>();
                for (int i = 0; i < s.length(); i++) {
                    char letter = s.charAt(i);
                    if (letter == '(') {
                        if (pars.isEmpty())
                            pars.push(letter);
                        else {
                            char top = pars.peek();
                            if (top != ')' )
                             pars.push(letter);
                         else {
                            pars.pop();
                        }
                    }
                    }
                    else {
                        if (pars.isEmpty())
                            return false;
                        else {
                            char top = pars.peek();
                            if (top != '(' )
                                return false;
                            else {
                                pars.pop();
                            }
                        }
                    }
                }
                return pars.isEmpty();
            }
        }
