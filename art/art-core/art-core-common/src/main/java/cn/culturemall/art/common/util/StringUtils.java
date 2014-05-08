package cn.culturemall.art.common.util;

public abstract class StringUtils {

    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
	
    public static String trimBlank(String str) {
    	if (str == null || str.length() == 0) {
            return str;
        }
		StringBuilder sb = new StringBuilder(str);
		while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
			sb.deleteCharAt(0);
		}
		while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
    }
    
	public static String parseNull(String str) {
		str = trimBlank(str);
		if(str == null || str.length() == 0) {
			return null;
		}
		return str;
	}
	
	public static String parseEmpty(String str) {
		str = trimBlank(str);
		if(str == null || str.length() == 0) {
			return "";
		}
		return str;
	}
}
