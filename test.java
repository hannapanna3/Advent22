import java.util.*;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Elves {
    public static void main(String[] args) throws IOException {
List<Integer> elfs = Arrays.stream(
    Files.readAllLines(Path.of("input.txt"))
            .stream()
            .collect(Collectors.joining(","))
            .split(",,"))
.map(e -> Arrays.stream(e.split(","))
    .mapToInt(Integer::parseInt).sum())
.sorted(Comparator.reverseOrder())
.collect(Collectors.toList());

System.out.println(elfs.get(0) + elfs.get(1) + elfs.get(2));

    }
}

//someone elses solution
