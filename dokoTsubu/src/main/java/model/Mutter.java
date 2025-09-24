package model;

import java.io.Serializable;
import java.util.regex.Pattern;

public class Mutter implements Serializable{
	private String userName;
	private String text;
	private String img;

	
	public Mutter() {}
	
	public Mutter(String usetName,String text,String img) {
		this.userName = usetName;
		this.text = maskIfDangerous(text);
		this.img = img;
		
	}
	
	public static String maskIfDangerous(String input) {
		String DANGEROUS_REGEX = ".*[<>&\";-]{2,}.*|.*<.*|.*>.*|.*&.*|.*'.*|.*\".*|.*--.*|.*;.*";
        if (input == null || input.trim().isEmpty()) {
            return input; // null または空白のみの文字列はそのまま返す
        }

        // 大文字・小文字を区別しない(CASE_INSENSITIVE)で正規表現に一致するかチェック
        // ただし、上記の DANGEROUS_REGEX は文字クラスなので、ほとんどの場合は不要です
        // より厳密には、例えば <script> のような特定のキーワードをチェックする場合に有用です
        if (Pattern.compile(DANGEROUS_REGEX, Pattern.DOTALL).matcher(input).matches()) {
            return "*****";
        } else {
            return input;
        }
    }
	
	
	public String getUserName() {return userName;}
	public String getText() {return text;}
	public String getImg() {return img;}
	
}
