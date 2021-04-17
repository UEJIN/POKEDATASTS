package com.example.pokedatasts;

public class PokemonPara extends PokemonStatus{
    int iID;
    String strName;
    int iLv;

    public PokemonPara(int iID ,int iLv ,String strName,Doryokuti doryokuti,Kotaiti kotaiti){
        int iSearchFlag;
        //図鑑番号とポケモンの名前から種族値を取得
        Pokemon pokemon = new Pokemon();
        iSearchFlag = pokemon.GetStatus(iID,strName);
        if(iSearchFlag ==1){
            this.iID = pokemon.iID;
            this.strName = pokemon.strName;
            this.iLv = iLv;
            CalcHP(doryokuti,kotaiti,pokemon,iLv);
            CalcAtoS(doryokuti,kotaiti,pokemon,iLv);
        }
    }

    private void CalcHP(Doryokuti doryokuti,Kotaiti kotaiti ,Pokemon shuzokuti,int iLv ){
        //(種族値×2+個体値+努力値÷4)×レベル÷100+レベル+10;
        //HP
        this.iH = ((shuzokuti.iH*2 + kotaiti.iH + doryokuti.iH/4) * iLv)/100 + 10 ;

    }

    private void CalcAtoS(Doryokuti doryokuti,Kotaiti kotaiti ,Pokemon shuzokuti,int iLv  ){
        //(種族値×2+個体値+努力値÷4)×レベル÷100+5
        this.iA = EachCalcAtoS(doryokuti.iA,kotaiti.iA,shuzokuti.iA,iLv);
        this.iB = EachCalcAtoS(doryokuti.iB,kotaiti.iB,shuzokuti.iB,iLv);
        this.iC = EachCalcAtoS(doryokuti.iC,kotaiti.iC,shuzokuti.iC,iLv);
        this.iD = EachCalcAtoS(doryokuti.iD,kotaiti.iD,shuzokuti.iD,iLv);
        this.iS = EachCalcAtoS(doryokuti.iS,kotaiti.iS,shuzokuti.iS,iLv);
    }

    private int EachCalcAtoS(int idoryokuti,int ikotaiti ,int ishuzokuti,int iLv  ){
        int istatus;
        //(種族値×2+個体値+努力値÷4)×レベル÷100+5
        istatus = ((ishuzokuti*2 + ikotaiti + idoryokuti/4)*iLv)/100 +5;
        return istatus;
    }

}
