public class main {
	//メイン処理
	public static void main(String[] args){
		Yuusya yuusya = new Yuusya();		//勇者オブジェクトを生成
		Wizard wizard = new Wizard();		//魔法使いオブジェクトを生成
		Cleric crelic = new Cleric();		//僧侶オブジェクトを生成
		LastBoss lastBoss = new LastBoss();	//ラスボスオブジェクトを生成

    // 勇者の体力
		System.out.println( yuusya.getName() + " の たいりょくは" + yuusya.getVitality() + "だ");
		System.out.println("");
    
		//敵があらわれた！
		System.out.println( lastBoss.getName() + " が あらわれた！");
		System.out.println("");

		//バトル開始
		yuusya.specialAttack(lastBoss);		//勇者の攻撃
		wizard.magicAttack(lastBoss);		//魔法使いの攻撃
		lastBoss.specialEvilAttack(yuusya);	//ラスボスの攻撃
		crelic.healingMagic(yuusya);		//僧侶が勇者を回復

		
		//回復アイテムを使用
		System.out.println(yuusya.getName() + " は やくそう　をつかった");
		yuusya.eatFood("やくそう");
		System.out.println(wizard.getName() + " は まほうのみず　をつかった");
		wizard.eatFood("まほうのみず");
		System.out.println("");

		//ステータス表示
		showStatus(yuusya);
		showStatus(wizard);
		showStatus(crelic);
		showStatus(lastBoss);
		
	}
	
	//ステータス表示メソッド
	private static void showStatus(Human target){
		System.out.println("- " + target.getName() + " の ステータス---");
		if(target.getGender() == 1){
			System.out.println("せいべつ ： 男");
		}else{
			System.out.println( "せいべつ ： 女");
		}
		System.out.println("しんちょう ： " + target.getLength());
		System.out.println("たいじゅう ： " + target.getWeight());
		System.out.println("たいりょく ： " + target.getVitality());
		System.out.println("まりょく ： " + target.getMagic());
		System.out.println("");
			
	}
}
