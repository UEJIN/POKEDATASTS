package com.example.pokedatasts;

public class Pokemon extends PokemonStatus {
    int iID;
    int iLv;
    String strName;

    int GetStatus(int iGetID,String strGetName){
        int iSearchFlag = 0;

        iSearchFlag = GetPokeStatus(iGetID);

        if (iSearchFlag == 0){
            iSearchFlag = GetPokeStatus(strGetName);
        }

        return iSearchFlag;
    }

    private int GetPokeStatus(int iGetID){
        int iLoop;
        int iSearchFlag = 0;
        for (iLoop=0; iLoop<ShuzokuDataTable.Tablenum; iLoop++){
            if(ShuzokuDataTable.PokeShuzokuVal[iLoop].iID == iGetID){
                iSearchFlag = 1;
                break;
            }
        }
        if(iSearchFlag == 1){
            SetStsatus(iLoop);
        }

        return iSearchFlag;
    }

    private int GetPokeStatus(String strGetName){
        int iLoop;
        int iSearchFlag = 0;
        for (iLoop=0; iLoop<ShuzokuDataTable.Tablenum; iLoop++){
            if(strGetName.equals(ShuzokuDataTable.PokeShuzokuVal[iLoop].strName)){
                iSearchFlag = 1;
                break;
            }
        }
        if(iSearchFlag == 1){
            SetStsatus(iLoop);
        }

        return iSearchFlag;
    }

    private void SetStsatus(int iInData){
        //データ設定
        this.iID = ShuzokuDataTable.PokeShuzokuVal[iInData].iID;
        this.strName = ShuzokuDataTable.PokeShuzokuVal[iInData].strName;
        this.iH = ShuzokuDataTable.PokeShuzokuVal[iInData].iH;
        this.iA = ShuzokuDataTable.PokeShuzokuVal[iInData].iA;
        this.iB = ShuzokuDataTable.PokeShuzokuVal[iInData].iB;
        this.iC = ShuzokuDataTable.PokeShuzokuVal[iInData].iC;
        this.iD = ShuzokuDataTable.PokeShuzokuVal[iInData].iD;
        this.iS = ShuzokuDataTable.PokeShuzokuVal[iInData].iS;
    }
}
