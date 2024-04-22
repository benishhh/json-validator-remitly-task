# JSON Validator for AWS IAM Roles

## Opis projektu
Projekt JsonValidator jest narzędziem do weryfikacji danych JSON określających
role IAM w usłudze Amazon Web Services (AWS). Główną funkcjonalnością aplikacji jest sprawdzenie, 
czy pole Resource w dokumentach polityki zawiera jedynie gwiazdkę (*), co może sugerować nadmiernie szerokie uprawnienia.
Aplikacja zapewnia metodę validateResource, która analizuje pliki JSON i zwraca false, jeśli znajdzie gwiazdkę, oraz true w przeciwnym przypadku.

## Wymagania techniczne

Do uruchomienia projektu potrzebne są:

- Java JDK w wersji 11 lub nowszej
- Maven w wersji 3.6.0 lub nowszej

## Uruchamianie projektu



