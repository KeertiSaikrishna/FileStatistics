import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public String solution(String S) {
        String[] arrOfStr = S.split("\n", -2);
        int music = 0;
        int images = 0;
        int movies = 0;
        int others = 0;
        for (String str : arrOfStr) {
            music += music_size(str);
            images += img_size(str);
            movies += mv_size(str);
            others += oth_size(str);
        }
        return ("music " + music + "b" + "\nimages " + images + "b" + "\nmovies " + movies + "b" + "\nothers " + others + "b");
    }

    public static int music_size(String s) {
        Pattern p1 = Pattern.compile(".mp3");
        Pattern p2 = Pattern.compile(".aac");
        Pattern p3 = Pattern.compile(".flac");

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        String[] arr1 = s.split(" ", 2);
        String[] arr;

        if (m1.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m2.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m3.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else {
            return 0;
        }
    }

    public static int img_size(String s) {
        Pattern p1 = Pattern.compile(".jpg");
        Pattern p2 = Pattern.compile(".bmp");
        Pattern p3 = Pattern.compile(".gif");

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        String[] arr1 = s.split(" ", 2);
        String[] arr;

        if (m1.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m2.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m3.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else {
            return 0;
        }
    }

    public static int mv_size(String s) {
        Pattern p1 = Pattern.compile(".mp4");
        Pattern p2 = Pattern.compile(".avi");
        Pattern p3 = Pattern.compile(".mkv");

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        String[] arr1 = s.split(" ", 2);
        String[] arr;

        if (m1.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m2.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m3.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else {
            return 0;
        }
    }

    public static int oth_size(String s) {
        Pattern p1 = Pattern.compile(".txt");
        Pattern p2 = Pattern.compile(".exe");
        Pattern p3 = Pattern.compile(".zip");
        Pattern p4 = Pattern.compile(".7z");

        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        Matcher m4 = p4.matcher(s);
        String[] arr1 = s.split(" ", 2);
        String[] arr;

        if (m1.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m2.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m3.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else if (m4.find()) {
            arr = arr1[1].split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))", -2);
            return (Integer.valueOf(arr[0]));
        } else {
            return 0;
        }
    }
}
