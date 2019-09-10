import com.dahuodong.bangchuizi.Mice
import org.scalatest.{DiagrammedAssertions, FunSuite}

class MiceSpec extends FunSuite with DiagrammedAssertions{
  test("Mice Backup"){
    assert(Mice.backup(Array("/tmp/hello-0.1.0-SNAPSHOT/bin/hello","/tmp/hello-0.1.0-SNAPSHOT/helloBak")).isInstanceOf[Unit])
  }

}
