package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        StringBuilder mirror = new StringBuilder();

        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror.append(string.charAt(end));
            }
            else {
                break;
            }
        }

        return begin == end ? string : mirror.toString();
    }
}
