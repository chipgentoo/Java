/**
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации:
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
package Sem_2;
public class Sem2hw1 {
    public static String parserJSON(String strJSON){
        String[] strArray;
        StringBuilder sb = new StringBuilder();

        // Разбираем JSON
        strJSON = strJSON.trim(); // Удаляем начальные и конечные пробелы из строки
        strJSON = strJSON.substring(1,strJSON.length()-1);      // избавляемся от {}
        strJSON = strJSON.replaceAll("\"","'"); // заменяем "" на '' для SQL формата
        strJSON = strJSON.replaceAll(":","=");  // заменяем : на =
        strArray = strJSON.split(",");
        for (int i = 0; i < strArray.length; i++) {
            if (!strArray[i].contains("null")){ // Если параметр не null
                sb.append(strArray[i].trim());
                if (i < strArray.length-1) { // Если параметр не последний
                    sb.append(" and ");
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String strSQL = "select * from students where ";
        String strJSON = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\", \"tel\":\"+7(123)123-45-67\"}";
        String parsJSON = parserJSON(strJSON);
        System.out.println(strSQL + parsJSON + ";");
    }
}


// На выходе: select * from students where 'name'='Ivanov' and 'country'='Russia' and 'city'='Moscow' and 'tel'='+7(123)123-45-67';