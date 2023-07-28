
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記例の配列をString型しか格納できないように修正してください。
//		現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//	       例List<Object> array = new ArrayList<>();
//		また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//	    <以下記述>
			List<String> list = new ArrayList<String>();
			list.add("hoge");
			list.add("pos");
			list.add("foo");
//      問② arrayの二つ目の要素を"bar"にしましょう。
//	　<以下記述>
			list.set(1,"bar");
			
//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
			System.out.println(list.get(2));
		}	

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
		map.put("address","////");
		map.put("name", "Takumi");
		map.put("age", "27");
		

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
		for(String KEY : map.keySet()) {
			System.out.println(KEY);
		}
			
		

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
		for(Object OJ : map.values()) {
			System.out.println(OJ);
		}
		}
		{
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
//	    <以下記述>
			Calendar cal = Calendar.getInstance();
			System.out.println(cal.get(Calendar.YEAR));
			System.out.println(cal.get(Calendar.MONTH)+1);
			System.out.println(cal.get(Calendar.DATE));
			
			int [] arrayDate = new int[3];
			arrayDate[0] = Calendar.YEAR;
			arrayDate[1] = Calendar.MONTH + 1;
			arrayDate[2] = Calendar.DATE;
			

			
			
			
			
			
//      問⑧ 配列arrayDateをList型に置換しましょう。
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
//	    <以下記述>
			List<Integer> list = new ArrayList<>();
			list.add(arrayDate[0]);
			list.add(arrayDate[1]);
			list.add(arrayDate[2]);
			
            
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
			for (int i = 0 ; i < arrayDate.length;) {
				}
			System.out.println(list);
		}
		}

	}


		
