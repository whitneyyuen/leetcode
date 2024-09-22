class Solution {
    public String simplifyPath(String path) {
        String result = path;
        if (result.substring(result.length()-1,result.length()).indexOf("/")<0) {
            result+="/";
        }
        while (result.indexOf("///")>=0) {
            result = result.replace("///","/");
        }
        while (result.indexOf("//")>=0) {
            result = result.replace("//","/");
        }
        while (result.indexOf("/./")>=0) {
            result = result.replace("/./","/");
        }
        while (result.indexOf("/../")>=0) {
            int position = result.indexOf("/../");
            int count = position;
            String temp = "";
            while (count>=0 && result.substring(count,position).indexOf("/")<0) {
                temp = result.substring(count,position);
                count--;
            }
            if (temp!="") {
                temp = "/" + temp;
            }
            temp += "/../";
            result = result.replaceFirst(temp,"/");
            result = result.replace("//","/");
        }
        if (result.length()>1 && result.substring(result.length()-1,result.length()).indexOf("/")>=0) {
            result = result.substring(0,result.length()-1);
        }

        return result;
    }
}