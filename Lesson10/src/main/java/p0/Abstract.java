package p0;

/*
Они позволяют описывать поля, методы, но не требуют их конкретизации и реализации.
Например, мы описываем класс автомобиль (Car), но пока незнаем как будут реализованы его методы.
В этом случае можно объявить его как абстрактный и просто прописать переменные и методы без конкретного наполнения:
 */
public class Abstract {

    public static void main(String[] args) {
        //отличие абстрактного от не абстрактного?
        // Во-первых, здесь нам приходится прописывать пустые реализации у методов и такие методы можно
        // уже не переопределять в дочерних классах. Абстрактные же методы обязаны быть определены в производных классах
        // и это, с одной стороны, гарантирует их требуемое наполнение, а с другой, помогает избежать ошибок, если программист забудет их определить.
        //Вторым важным моментом отличия абстрактных классов от обычных – невозможность создания их экземпляров.
        //Это позволяет дополнительно защитить программу от ее нежелательного использования,
        // когда класс должен браться исключительно в качестве базового и не разрешать создавать свои экземпляры.
    }
}

/*
Абстракция в данном случае означает, что мы знаем что хотим от автомобиля, но пока незнаем как это будем делать.
Своего рода, это некий набросок – абстракция, причем, абстракция на уровне класса и методов.
 */
abstract class Car {
    private String model;//характеристики

    //методы абстрактные
    public abstract void go();

    public abstract void stop();

    public abstract void draw();
    //методы обычные
}

/*
такие классы создаются исключительно для дальнейшего наследования и конкретизации их работы уже в дочерних классах.
 А абстракция позволяет сразу описать необходимые интерфейсы (то есть, методы), через которые в дальнейшем
 будут вызываться соответствующие переопределенные методы дочерних классов.
  Это часто очень удобно при реализации больших проектов, когда в целом определены информационные потоки
  через абстрактные классы и интерфейсы, а далее, создаются производные классы для их конкретного наполнения, реализации.
 */
//class ToyotaCorolla extends Car {
//
//}