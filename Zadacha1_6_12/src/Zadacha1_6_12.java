public class Zadacha1_6_12 {
    public static void main(String[] args) {
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
        };
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};

        System.out.println(printsbTextPerRole(roles, textLines));
    }

    private static String printsbTextPerRole(String[] roles, String[] textLines) {
        StringBuilder textOneRole = new StringBuilder();
        StringBuilder text = new StringBuilder();
        StringBuilder sbRole = new StringBuilder();

        for (String role : roles) {
            sbRole.append(role).append(":");
            textOneRole.append(sbRole).append("\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(sbRole.toString())) {
                    textLines[i] = textLines[i].replaceFirst(sbRole.toString(), "");
                    text.append(i + 1).append(")").append(textLines[i]);
                    textOneRole.append(text).append("\n");
                    text.setLength(0);
                }
            }
            textOneRole.append("\n");
            sbRole.setLength(0);
        }

        return textOneRole.toString();
    }
}
