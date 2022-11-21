package login.Server;

import login.Client.MenjadoraReader.MenjadoraReader;
import org.json.JSONObject;

public class SMenjadora {
    public SMenjadora() {
    }

    public String firstUpdate(){
        System.out.println("FIRSTUpdate");
        return generateJson().toString();
    }
    public String update(){
        System.out.println("Update");
        return "null";
    }

    private JSONObject generateJson() {

        JSONObject maquinaJSON = new JSONObject();
        JSONObject menjadoraEsquerra = new JSONObject();
        JSONObject mascotaEsquerra = new JSONObject();
        JSONObject menjadoraDreta = new JSONObject();

        menjadoraEsquerra.put("sensorPlat", 3.2);
        menjadoraEsquerra.put("gramsAcumulatAvui", 56.3);
        menjadoraEsquerra.put("raccionsAcumuladesAvui", 4);
        menjadoraEsquerra.put("gramsRaccio", 9.2);
        menjadoraEsquerra.put("limitDiari", 351);
        menjadoraEsquerra.put("valorDiposit", 200);
        menjadoraEsquerra.put("limitRaccionsDia", 15);

        mascotaEsquerra.put("nom", "Duna");
        menjadoraEsquerra.put("mascota", mascotaEsquerra);

        maquinaJSON.put("menjadoraDreta", menjadoraEsquerra);
        maquinaJSON.put("menjadoraEsquerra", menjadoraEsquerra);

        return maquinaJSON;
    }
}
