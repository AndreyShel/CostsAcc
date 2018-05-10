package exppack
import scala.concurrent.Future


trait Repository[ID, T] {

  def put(item: T): Future[Unit]

  def all(): Future[Seq[T]]

  // def get(key: ID): Future[T]
  // def delete(key: ID): Future[Unit]
}

