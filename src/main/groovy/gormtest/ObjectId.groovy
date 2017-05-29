package gormtest

interface ObjectId<T> extends Serializable {
    T getId()
    void setId(T id)
}