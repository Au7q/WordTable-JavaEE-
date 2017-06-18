package model;

import java.util.ArrayList;

public class WordTable {
	private String str;// 入力された文字列
	ArrayList<String> word = new ArrayList<String>();// 単語
	ArrayList<WordCount> wordCount = new ArrayList<WordCount>();// 単語と頻度の組み合わせ

	public WordTable(String str) {// コンストラクタ
		this.str = str;
	}

	private void splitWord() {// 文字列を単語に分割して単語リストに登録
		String[] splitStr = str.split("[\\s,!?.]+");// 文字列を区切ったもの

		for (int i = 0; i < splitStr.length; i++) {
			word.add(splitStr[i]);// 文字列を区切ったものを単語として登録
		}
	}

	private void overlayWord() {// 単語の重複を無くし、同じ単語のカウントを行う
		splitWord();

		boolean flag;// wordCountに重複する単語が存在するか判定用の変数

		for (int i = 0; i < word.size(); i++) {// 単語の数だけ繰り返す(1)
			flag = false;

			for (int j = 0; j < wordCount.size(); j++) {// 頻度表に登録されている単語の数だけ繰り返す(2)

				if (wordCount.get(j).getWord().equals((word.get(i)))) {// 「wordリストのi番目の単語」がwordCountに含まれているか
					// 「wordCountのj番目の単語」のcountを1増やす処理開始
					wordCount.get(j).setCount(wordCount.get(j).getCount() + 1);
					// 「mapリストのj番目の単語」のcountを1増やす処理終了
					flag = true;
					break;// (2)を抜け出す
				}
			}

			if (flag == false) {
				wordCount.add(new WordCount(word.get(i), 1));// wordCountに新しい単語を追加
			}
		}
	}

	public ArrayList<WordCount> returnWordTable() {// wordCountを返却する
		overlayWord();
		return wordCount;
	}
}
