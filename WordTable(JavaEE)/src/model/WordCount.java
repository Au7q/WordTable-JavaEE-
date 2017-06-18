package model;

import java.io.Serializable;

public class WordCount implements Serializable{
	private String word;// 単語
	private int count;// ある一つの単語のカウント

	public WordCount() {

	}

	public WordCount(String word, int count) {// コンストラクタ
		this.word = word;
		this.count = count;
	}

	// アクセサ
	public String getWord() {
		return word;
	}

	public int getCount() {
		return count;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
