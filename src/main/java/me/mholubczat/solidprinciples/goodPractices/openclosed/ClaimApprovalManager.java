package me.mholubczat.solidprinciples.goodPractices.openclosed;

public class ClaimApprovalManager {

    public void processClaim(InsuranceConveyor insuranceConveyor){
        if (insuranceConveyor.isValidClaim()){
            System.out.println("Is valid claim");

        }
    }
}
