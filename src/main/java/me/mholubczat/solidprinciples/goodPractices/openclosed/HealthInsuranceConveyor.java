package me.mholubczat.solidprinciples.goodPractices.openclosed;

public class HealthInsuranceConveyor implements InsuranceConveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("Validating insurance claim");
        return false;
    }
}
