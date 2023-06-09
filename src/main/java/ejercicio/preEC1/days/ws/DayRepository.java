package ejercicio.preEC1.days.ws;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Days;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DayRepository {
    private static final Map<String, Days> days = new HashMap<>();
    @PostConstruct
	public void initData() {
		Days lunes = new Days();
		lunes.setName("Lunes");
        lunes.setTraduction("Monday");
        lunes.setNumber(1);
        lunes.setSum(lunes.getNumber()+2);
		days.put(lunes.getName(), lunes);

		Days martes = new Days();
		martes.setName("Martes");
        martes.setTraduction("Tuesday");
        martes.setNumber(2);
        martes.setSum(martes.getNumber()+3);
		days.put(martes.getName(), martes);

        Days miercoles = new Days();
		miercoles.setName("Miercoles");
        miercoles.setTraduction("Wednesday");
        miercoles.setNumber(3);
        miercoles.setSum(miercoles.getNumber()+4);
		days.put(miercoles.getName(), miercoles);

        Days jueves = new Days();
		jueves.setName("Jueves");
        jueves.setTraduction("Thursday");
        jueves.setNumber(4);
        jueves.setSum(jueves.getNumber()+5);
		days.put(jueves.getName(), jueves);

        Days viernes = new Days();
		viernes.setName("Viernes");
        viernes.setTraduction("Friday");
        viernes.setNumber(5);
        viernes.setSum(viernes.getNumber()+6);
		days.put(viernes.getName(), viernes);

        Days sabado = new Days();
		sabado.setName("Sabado");
        sabado.setTraduction("Saturday");
        sabado.setNumber(6);
        sabado.setSum(sabado.getNumber()+7);
        days.put(sabado.getName(), sabado);

        Days domingo = new Days();
		domingo.setName("Domingo");
        domingo.setTraduction("Sunday");
        domingo.setNumber(7);
        domingo.setSum(domingo.getNumber()+8);
		days.put(domingo.getName(), domingo);

	}


    public Days findDays(String name) {
		Assert.notNull(name, "The day's name must not be null");
		return days.get(name);
	}
}
