import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="Artifacts")
public class Artifacts {
        List<Artifact> artifactsDatas = new ArrayList<>();

        public List<Artifact> getArtifactsDatas() {
            return artifactsDatas;
        }

        @XmlElement(name="Artifact")
        public void setArtifactsDatas(List<Artifact> artifactsDatas) {
            this.artifactsDatas = artifactsDatas;
        }

        public void addArtifactsDatas(Artifact xmldata){
            this.artifactsDatas.add(xmldata);
        }
}
