package ru.converter;

import ru.temperature.Temperature;

// конвертер принимает температуру одного типа и передаёт её как температуру другого типа
// мы хотим, чтобы температура сама знала, какого она типа, и умела самостоятельно себя приводить
// в текстовое представление (методом toString())

// интерфейс
// если мы ожидаем, что наш интерфейс будет использоваться как функциональный интерфейс, т. е. у нас могут гулять лямбды,
// то лучше воспользоваться аннотацией @FunctionalInterface -- она говорит компилятору, чтобы он проверил, что мы
// не сделали лишних прототипов функций; аннотация говорит о том, что должна быть объявлена ТОЛЬКО ОДНА функция (не 0 и не 2)
@FunctionalInterface
public interface Converter {
    // конвертер принимает температуру и возвращает температуру
    Temperature convert(Temperature temp);
}
