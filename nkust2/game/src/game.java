public class game extends role {
    int HP; //data member
    int MP; //data member
    int ATTACK; //data member
    game(int roleHP, int roleMP, int roleATTACK) {
        super(roleHP,roleMP,roleATTACK);
    }
    String getMyName() {
        return this.name; //this 指向此類別本身
    }
    String getweaponName() {
        return this.weapon; //this 指向此類別本身
    }
    String getMovesName() {
        return this.Moves; //this 指向此類別本身
    }
    void ShoutMyName() {
        //method member
        System.out.println("MY NAME IS " + getMyName() + "!!!!!!!!!!!"); //於類別內呼叫getMyName函數
        System.out.println("MY weapon IS " + getweaponName() + "!!!!!!!!!!!");
        System.out.println("i use " + getMovesName() + "!!!!!!!!!!!");
    }
}
