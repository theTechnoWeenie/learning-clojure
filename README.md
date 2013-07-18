# hello-world

This simple clojure project is a collection of solutions to [Project Euler | projecteuler.net]
This will spoil the fun (of selected problems) if you go digging through the source.

## Installation

Clone, or fork this repo, and compile the code. You may need [leiningen | http://leiningen.org/]

## Usage

This is a very basic example that should evolve over time, but for now will just say hello world.

    $ lein run
    > Hello, world!

## Options

Currently accepts no options

## Examples

    $ lein repl
    $ hello-world.core=> (prob-2 4000000)

### Bugs

* (prob-2 limit) throws an Arithmeticexception for an intoverflow on the first run, but an additional run with the same parameters succeeds.

## License

Copyright © 2013 Sam Jantz

Distributed under the Eclipse Public License, the same as Clojure.
