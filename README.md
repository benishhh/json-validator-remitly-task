# JSON Validator for AWS IAM Roles

## Project Description
The JsonValidator project is a tool for verifying JSON data defining IAM roles within Amazon Web Services (AWS). The primary functionality of the application is to check whether the `Resource` field in policy documents contains only an asterisk (*), which may suggest overly broad permissions. The application provides a `validateResource` method that analyzes JSON files and returns `false` if it finds an asterisk, and `true` otherwise.

## Technical Requirements

To run the project, you will need:

- Java JDK version 11 or newer
- Maven version 3.6.0 or newer

## Running the Project

1. Clone the repository:

```
git clone https://github.com/benishhh/json-validator-remitly-task
```


2. Navigate to the project directory and run the tests:

```
cd remitlytask
```
```
mvn test
```


## How It Works?

### `validateResource` Method

The core functionality of the application is implemented in the `validateResource` method, which analyzes JSON files representing AWS IAM Role policies. This method checks whether the `Resource` field in each `Statement` object contains only an asterisk (`*`). Such a policy configuration may suggest overly broad permissions, which is typically considered a risky practice in access management.

#### Validation Process
1. **Loading the JSON file**: The method accepts a path to a JSON file, which is then loaded into a `Policy` object structure.
2. **Checking JSON structure**: The method verifies whether the JSON file contains the required fields, including `PolicyDocument` and `Statements`. If any of these fields are absent, the method throws an `IOException`.
3. **Analyzing the `Resource` field**: For each `Statement` object, the method checks if the `Resource` field contains only an asterisk (`*`). If so, the method returns `false`; otherwise, it returns `true`.

### Unit Tests

To ensure the reliability and correctness of the `validateResource` method, the project includes a set of unit tests. These tests check various scenarios, including:

- **Tests with an asterisk (`*`) in the `Resource` field**: These tests verify whether the method correctly returns `false` for JSON files where the `Resource` field contains an asterisk.
- **Tests without an asterisk in the `Resource` field**: These tests confirm whether the method returns `true` when the `Resource` field does not contain an asterisk, suggesting properly restricted permissions.
- **Exception tests**: Additional tests check how the method handles JSON files that are incomplete or have an incorrect format. These tests help ensure that the application correctly identifies and reports data input issues.

---
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

1. Sklonowanie repozytorium:

```
git clone https://github.com/benishhh/json-validator-remitly-task
```

2. Przejście do katalogu projektu i uruchomienie testów:
```
cd remitlytask
```
```
mvn test
```

## Jak to działa?

### Metoda `validateResource`

Główna funkcjonalność aplikacji jest zaimplementowana w metodzie `validateResource`, która analizuje pliki JSON reprezentujące polityki AWS IAM Role. Metoda ta sprawdza, czy wartość pola `Resource` w każdym obiekcie `Statement` zawiera tylko gwiazdkę (`*`). Taka konfiguracja polityki może sugerować nadmiernie szerokie uprawnienia, co jest zwykle uważane za ryzykowną praktykę w zarządzaniu dostępem.

#### Proces Walidacji
1. **Wczytanie pliku JSON**: Metoda przyjmuje ścieżkę do pliku JSON, który zostaje wczytany do struktury obiektowej `Policy`.
2. **Sprawdzenie struktury JSON**: Metoda weryfikuje, czy plik JSON zawiera wymagane pola, w tym `PolicyDocument` i `Statements`. Jeśli którekolwiek z tych pól jest nieobecne, metoda zgłasza wyjątek `IOException`.
3. **Analiza pola `Resource`**: Dla każdego obiektu `Statement` metoda sprawdza, czy pole `Resource` zawiera tylko gwiazdkę (`*`). Jeśli tak, metoda zwraca `false`, w przeciwnym razie `true`.

### Testy jednostkowe

Aby zapewnić niezawodność i poprawność działania metody `validateResource`, projekt zawiera zestaw testów jednostkowych. Testy te sprawdzają różne scenariusze, w tym:

- **Testy z gwiazdką (`*`) w polu `Resource`**: Testy te sprawdzają, czy metoda poprawnie zwraca `false` dla plików JSON, w których pole `Resource` zawiera gwiazdkę.
- **Testy bez gwiazdki w polu `Resource`**: Te testy weryfikują, czy metoda zwraca `true`, gdy pole `Resource` nie zawiera gwiazdki, sugerując prawidłowo ograniczone uprawnienia.
- **Testy wyjątków**: Dodatkowe testy sprawdzają, jak metoda radzi sobie z plikami JSON, które są niekompletne lub mają błędny format. Testy te pomagają upewnić się, że aplikacja poprawnie identyfikuje i zgłasza problemy z danymi wejściowymi.
