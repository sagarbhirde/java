func main() {

    fmt.Println("Start")

    defer fmt.Println("Deferred 1")

    fmt.Println("Middle")

    defer fmt.Println("Deferred 2")

    fmt.Println("End")

    defer fmt.Println("Deferred 3")
}


