# Занятие 11 Коллекции. Equals. hashCode
<code>
-------------------------- INITIAL -----------------------------
1  User[]    : [[ Pan : 41 ], [ Pan : 41 ], [ Alf : 12 ], [ Ion : 64 ], [ Iov : 46 ], [ Alf : 12 ], [ Alf : 35 ], [ Iov : 41 ], [ Ion : 64 ], [ Yan : 12 ]]
-------------- Equals & HashCode not overrided -----------------
2  ArrayList : [[ Pan : 41 ], [ Pan : 41 ], [ Alf : 12 ], [ Ion : 64 ], [ Iov : 46 ], [ Alf : 12 ], [ Alf : 35 ], [ Iov : 41 ], [ Ion : 64 ], [ Yan : 12 ]]
3  HashSet   : [[ Alf : 12 ], [ Alf : 35 ], [ Yan : 12 ], [ Alf : 12 ], [ Ion : 64 ], [ Iov : 46 ], [ Pan : 41 ], [ Ion : 64 ], [ Iov : 41 ], [ Pan : 41 ]]
4  HashMap   : {64=Ion, 35=Alf, 41=Iov, 12=Yan, 46=Iov}
--------------- Only equals overrided ---------------------------
5  ArrayList : [[ Pan : 41 ], [ Pan : 41 ], [ Alf : 12 ], [ Ion : 64 ], [ Iov : 46 ], [ Alf : 12 ], [ Alf : 35 ], [ Iov : 41 ], [ Ion : 64 ], [ Yan : 12 ]]
6  HashSet   : [[ Iov : 41 ], [ Ion : 64 ], [ Pan : 41 ], [ Ion : 64 ], [ Alf : 12 ], [ Alf : 12 ], [ Alf : 35 ], [ Pan : 41 ], [ Iov : 46 ], [ Yan : 12 ]]
7  HashMap   : {64=Ion, 35=Alf, 41=Iov, 12=Yan, 46=Iov}
--------------- Only HashCode overrided --------------------------
8  ArrayList : [[ Pan : 41 ], [ Pan : 41 ], [ Alf : 12 ], [ Ion : 64 ], [ Iov : 46 ], [ Alf : 12 ], [ Alf : 35 ], [ Iov : 41 ], [ Ion : 64 ], [ Yan : 12 ]]
9  HashSet   : [[ Iov : 46 ], [ Yan : 12 ], [ Alf : 35 ], [ Alf : 12 ], [ Alf : 12 ], [ Iov : 41 ], [ Ion : 64 ], [ Ion : 64 ], [ Pan : 41 ], [ Pan : 41 ]]
10 HashMap   : {64=Ion, 35=Alf, 41=Iov, 12=Yan, 46=Iov}
--------------- Equals & HashCode overrided -------------------------
11 ArrayList : [[ Pan : 41 ], [ Pan : 41 ], [ Alf : 12 ], [ Ion : 64 ], [ Iov : 46 ], [ Alf : 12 ], [ Alf : 35 ], [ Iov : 41 ], [ Ion : 64 ], [ Yan : 12 ]]
12 HashSet   : [[ Iov : 46 ], [ Yan : 12 ], [ Alf : 35 ], [ Alf : 12 ], [ Iov : 41 ], [ Ion : 64 ], [ Pan : 41 ]]
13 HashMap   : {64=Ion, 35=Alf, 41=Iov, 12=Yan, 46=Iov}
</code>

Что-то меняется только в строке 9, после того как мы переопределили метод генерации HashCode, поменялся порядок элементов в коллекции,
поскольку порядок следования элементов в HashSet зависит от хеш кодов элементов
В строке 12, после переопределения HashCode и Equals мы видим, что повторяющиеся элементы отсутсвуют, поскольку
Set(множество) при правильно определенной логике equals и hashset не хранит повторяющиеся элементы.
HashMap это отдельный случай, вне зависимости от HashCode и Equals, в этой коллекции не может быть двух элементов с одинаковыми полями Key
