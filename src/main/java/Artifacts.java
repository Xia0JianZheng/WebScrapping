import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene una lista de la clase Artifact
 */
@XmlRootElement(name="Artifacts")
public class Artifacts {
        List<Artifact> artifactsDatas = new ArrayList<>();

    /**
     * Aqui cogemos la lista de Artifact.
     * @return devuelve la lista.
     */
        public List<Artifact> getArtifactsDatas() {
            return artifactsDatas;
        }

    /**
     * Aqui asignamos una lista de la clase Artifact
     * @param artifactsDatas recibe el que asignaremos a la lista
     */
        @XmlElement(name="Artifact")
        public void setArtifactsDatas(List<Artifact> artifactsDatas) {
            this.artifactsDatas = artifactsDatas;
        }

    /**
     * Añade los datos en la lista Artifacts
     * @param xmldata recibe los datos de artifact
     */
        public void addArtifactsDatas(Artifact xmldata){
            this.artifactsDatas.add(xmldata);
        }
}
