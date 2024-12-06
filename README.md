# Kalkulator GUI - README
Opis projektu

Ten projekt jest prostą aplikacją kalkulatora graficznego (GUI) napisaną w języku Java przy użyciu biblioteki Swing. Kalkulator umożliwia wykonywanie podstawowych operacji arytmetycznych, takich jak dodawanie, odejmowanie, mnożenie i dzielenie. Do obsługi obliczeń matematycznych wykorzystano bibliotekę exp4j, która umożliwia wygodną ewaluację wyrażeń matematycznych.
Funkcjonalności

    Podstawowe operacje matematyczne: Dodawanie, odejmowanie, mnożenie i dzielenie.
    Zmienianie znaku liczby: Przycisk +/- umożliwia zmianę znaku liczby.
    Czyszczenie ekranu: Przycisk C usuwa wszystkie dane z wyświetlacza.
    Obsługa ułamków dziesiętnych: Umożliwia wprowadzanie liczb z przecinkami (,) lub kropkami (.).
    Wyświetlanie wyników: Po kliknięciu = aplikacja oblicza wynik wprowadzonego wyrażenia.

Jak działa kalkulator?
Struktura interfejsu:

    Główne okno aplikacji składa się z:
        Wyświetlacza: Pole tekstowe w górnej części ekranu do podglądu wprowadzanego wyrażenia i wyników.
        Panelu przycisków: Siatka przycisków ułożonych w formacie 5x4. Każdy przycisk ma przypisaną funkcję, taką jak wprowadzenie liczby, operatora matematycznego lub wykonanie obliczeń.

Logika działania:

    Po wprowadzeniu wyrażenia za pomocą przycisków kalkulatora, użytkownik klika =, aby obliczyć wynik.
    Program przekształca wprowadzone wyrażenie (zamienia przecinki na kropki) i przekazuje je do biblioteki exp4j.
    Wynik jest obliczany i wyświetlany na ekranie.
    Przyciski +/- i C umożliwiają zmianę znaku liczby oraz resetowanie kalkulatora.

Wymagania

    Java Development Kit (JDK) 8 lub nowszy.
    Biblioteka exp4j:
        Pobierz i zaimportuj plik JAR biblioteki do projektu. Można ją znaleźć na stronie exp4j na GitHubie.

Instalacja i uruchamianie

    Sklonuj repozytorium lub pobierz kod źródłowy.
    Upewnij się, że biblioteka exp4j jest dodana do ścieżki klas projektu (np. w IDE Eclipse lub IntelliJ IDEA).
    Skompiluj projekt:

javac Main.java

Uruchom aplikację:

    java Main

Instrukcja obsługi

    Uruchom aplikację.
    Wprowadź wyrażenie matematyczne za pomocą przycisków na ekranie.
    Kliknij = (równa się), aby zobaczyć wynik.
    Aby zmienić znak liczby, kliknij +/-.
    Kliknij C, aby wyczyścić wyświetlacz.

Przykłady działania

    Dodawanie:
        Wprowadź: 5 + 3 =
        Wynik: 8

    Dzielenie:
        Wprowadź: 10 / 2 =
        Wynik: 5

    Zmiana znaku:
        Wprowadź: 5 +/-
        Wyświetlacz: -5

    Czyszczenie wyświetlacza:
        Kliknij C, aby usunąć wprowadzone dane.

Struktura kodu

    Klasa Calc:
        Odpowiada za tworzenie interfejsu graficznego i obsługę przycisków.
        Zawiera metody do inicjalizacji GUI oraz obsługi zdarzeń.
    Klasa Main:
        Główna klasa uruchamiająca aplikację.

Możliwe ulepszenia

    Obsługa bardziej zaawansowanych funkcji matematycznych (np. potęgowanie, pierwiastkowanie, logarytmy).
    Zaimplementowanie obsługi błędów (np. dzielenie przez zero) z bardziej przyjaznymi komunikatami dla użytkownika.
    Rozszerzenie interfejsu o dodatkowe funkcjonalności, takie jak pamięć (MC, M+, M-).

Autor: [Przem-T]
