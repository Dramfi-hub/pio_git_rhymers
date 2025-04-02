package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca licznik oparty na stosie.
 * Ta klasa implementuje podstawowe operacje na stosie, takie jak dodawanie elementów (countIn), 
 * usuwanie elementów (countOut), sprawdzanie czy stos jest pusty (callCheck) oraz pełny (isFull).
 * 
 * <p>Klasa używa tablicy do przechowywania wartości oraz zmiennej {@code currentIndex} do
 * śledzenia pozycji w tablicy. Zmienna {@code total} przechowuje liczbę elementów na stosie.</p>
 * 
 * @author YourName
 * @version 1.0
 * @since 2025-04-02
 */
public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];  // Tablica przechowująca liczby w stosie
    private int currentIndex = -1;  // Indeks wskazujący na ostatni element w stosie
    private int total = -1;  // Liczba elementów w stosie

    /**
     * Dodaje liczbę do stosu, jeśli stos nie jest pełny.
     * Jeśli stos nie jest pełny, liczba zostaje dodana na szczyt stosu.
     * 
     * @param in Liczba, którą chcemy dodać do stosu
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++currentIndex] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     * 
     * @return {@code true} jeśli stos jest pusty, w przeciwnym przypadku {@code false}
     */
    public boolean callCheck() {
        return currentIndex == -1;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     * Stos jest pełny, jeśli indeks {@code currentIndex} osiągnął maksymalną wartość (11).
     * 
     * @return {@code true} jeśli stos jest pełny, w przeciwnym przypadku {@code false}
     */
    public boolean isFull() {
        return currentIndex == 11;
    }

    /**
     * Zwraca wartość znajdującą się na szczycie stosu, nie usuwając jej.
     * 
     * @return Wartość na szczycie stosu lub {@code -1} jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[currentIndex];
    }

    /**
     * Usuwa i zwraca wartość ze szczytu stosu.
     * Jeśli stos jest pusty, zwraca {@code -1}.
     * 
     * @return Wartość na szczycie stosu lub {@code -1} jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[currentIndex--];
    }

    /**
     * Zwraca liczbę elementów na stosie.
     * Liczba elementów jest przechowywana w zmiennej {@code total}.
     * 
     * @return Liczba elementów na stosie (może być zmieniona przez metodę {@code setTotal})
     */
    public int getTotal() {
        return total;  
    }

    /**
     * Ustawia liczbę elementów na stosie.
     * Zmienna {@code total} jest aktualizowana, aby odzwierciedlać liczbę elementów w stosie.
     * 
     * @param total Liczba elementów, którą chcemy ustawić
     */
    public void setTotal(int total) {
        this.total = total;
    }
}
