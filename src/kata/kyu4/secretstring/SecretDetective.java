package kata.kyu4.secretstring;

/**
 * Не самая оптимальная реализация.
 * Приходится проходить два раза по списку триплетов - туда и обратно
 */
public class SecretDetective {
    public String recoverSecret(char[][] triplets) {
        StringBuilder answer = new StringBuilder();
        for (int triplet = 0; triplet < triplets.length; triplet++) {
            sortTriplet(answer, triplets[triplet]);
        }
        for (int triplet = triplets.length - 1; triplet >=0 ; triplet--) {
            sortTriplet(answer, triplets[triplet]);
        }
        return answer.toString();
    }

    private StringBuilder sortTriplet(StringBuilder answer, char[] triplet) {
        for (int i = 0; i < 3; i++) {
            char c = triplet[i];

            if (answer.indexOf(String.valueOf(c)) == -1) {
                // no char in answer - add to the end
                answer.append(c);
            }

            // sort char
            if (i == 0 || i ==1) {
                char right = triplet[i + 1];
                if (answer.indexOf(String.valueOf(right)) != -1 &&
                        answer.indexOf(String.valueOf(c)) > answer.indexOf(String.valueOf(right))) {
                    //insert c right BEFORE right in triplet
                    answer.deleteCharAt(answer.indexOf(String.valueOf(c)));
                    answer.insert(answer.indexOf(String.valueOf(right)), c);
                }
            }
        }
        return answer;
    }
}
