# AboveIT-oppgave
oppgaven til aboveit


Mobiloperatør-applikasjon
Dette er en enkel Java-applikasjon som simulerer en mobiloperatør. Den lar deg administrere abonnementer, kunder og generere månedlige fakturaer for kundene basert på forbruk og abonnementspriser.

Funksjoner
Abonnementshåndtering:

Legg til nye abonnementer i systemet.
Se alle registrerte abonnementer.
Slett et abonnement og alle kunder som er tilknyttet det.
Kundehåndtering:

Registrer nye kunder med telefonnummer, fornavn, etternavn og tilhørende abonnement.
Se alle registrerte kunder.
Slett kunder fra systemet.
Dataforbruk:

Oppdater dataforbruk for kunder gjennom måneden.
Nullstill dataforbruket for alle kunder ved slutten av måneden.
Fakturering:

Generer månedlige fakturaer for kundene basert på abonnementspriser og dataforbruk.
Beregn kostnaden for hver kunde basert på abonnementspris og eventuelt ekstra dataforbruk.
Nullstill dataforbruk for alle kunder.
Hvordan bruke
Start Java-programmet ved å kjøre Main.java.

Legg til abonnementer ved hjelp av Mobiloperator.registerSubscription().

Registrer kunder med Mobiloperatør.registerCustomer(). Knytt kunder til abonnementer ved hjelp av abonnementets ID.

Oppdater dataforbruket for kundene ved å bruke Kunde.oppdaterDataforbruk() i løpet av måneden.

Ved slutten av måneden kan du generere fakturaer med Mobiloperatør.beregnOgSendFaktura(). Dette vil også nullstille dataforbruket for alle kunder.

Du kan slette kunder og abonnementer med Mobiloperatør.slettKunde() og Mobiloperatør.slettAbonnement(). Husk at når et abonnement slettes, vil alle kunder som bruker det, også slettes.

Eksempel
Her er et eksempel på hvordan du kan bruke Mobiloperatør-applikasjonen:

java
Copy code
public class Main {
    public static void main(String[] args) {
        MobileOperator mobilOperator = new MobileOperator();

        // Opprett abonnementer og kunder

        // Oppdater dataforbruk gjennom måneden

        // Generer faktura og nullstill dataforbruk ved slutten av måneden

        // Slett kunder og abonnementer ved behov
    }
}

#TESTET
du vil finne test klassen hvor jeg tester mobiloperator klassen og subscription klassen junit testing ble brukt dette ble noe veldig simpelt testing


ps jeg rakk ikke å gjøre de to siste oppgavene etter at jeg ikke fikk nok tid til det men jeg prøvde mitt beste
