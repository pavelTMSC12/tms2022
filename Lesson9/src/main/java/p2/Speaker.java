package p2;

/**
 * В языке Java подобную проблему частично позволяют решить интерфейсы.
 * Интерфейсы определяют некоторый функционал, не имеющий конкретной реализации,
 * который затем реализуют классы, применяющие эти интерфейсы.
 * И один класс может применить множество интерфейсов.
 * <p>
 * Есть инкапсуляция в методы и есть в интерфейсы (пример пульт от телевизора, но нам все равно как это реализовано)
 * предоставляют механизм познего связывания.
 * получение данных из бд из файловой системы и т.д - Dao(объект который получает данные)
 * <p>
 * когда будет разные реализации какихто действий( методов)
 * объединяем интерфейсом общий кусок функциональности. Dog, cat, person(куча данных есть) все они могут говорить.
 */
public interface Speaker {
    void speak(); //по умолчанию public
}
