package exercise3;

public class Dog {
    int size;
    // 吠えるメソッドを作る（引数なし）
    //　サイズに（size変数）によって吠え方を変える　３パターンで
    String name;

    // 「〜〜は〜と吠えた」と出力する

    public void bark(){
        if(size >20) {
            System.out.println(name + "は" + "ワン" + "と吠えた");
        }else if(size > 10) {
            System.out.println(name + "は" + "ワンワン" +  "と吠えた");
        }else{
            System.out.println(name + "は" + "ワンワンワン" + "と吠えた");
        }
    }

    // もう一つの書き方
    // int size;
    // String name
    //
    // public void bark(){
    // String msg;
    // if(size > 20){
    //      msg = "ワン";
    // }else if (size > 10) {
    //      msg = "ワンワン";
    //}else{
    //      msg = "ワンワンワン";
    // }
    // System.out.println(name + "は" + msg + "と吠えた");
    // }


}
