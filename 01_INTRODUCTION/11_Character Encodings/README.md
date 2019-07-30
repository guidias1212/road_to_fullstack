# 1.11) Character Encodings

Character encoding is used to represent a repertoire of characters by some kind of encoding system.[1] Depending on the abstraction level and context, corresponding code points and the resulting code space may be regarded as bit patterns, octets, natural numbers, electrical pulses, etc. A character encoding is used in computation, data storage, and transmission of textual data. "Character set", "character map", "codeset" and "code page" are related, but not identical, terms.

<details open>
<summary>Table of Contents</summary>
<br>

[Terminology related to character encoding](#h1)

[Character repertoire (the abstract set of characters)](#h2)

[USEFULL LINKS](#h3)

</details>

<a name="h1"/>

**Terminology related to character encoding:**

* A **character** is a minimal unit of text that has semantic value.
* A **character set** is a collection of characters that might be used by multiple languages. Example: The Latin character set is used by English and most European languages, though the Greek character set is used only by the Greek language.
* A **coded character set** is a character set in which each character corresponds to a unique number.
* A **code point** of a coded character set is any allowed value in the character set.
* A **code unit** is a bit sequence used to encode each character of a repertoire within a given encoding form.

<a name="h2"/>

**Character repertoire (the abstract set of characters):**

The character repertoire is an abstract set of more than one million characters found in a wide variety of scripts including Latin, Cyrillic, Chinese, Korean, Japanese, Hebrew, and Aramaic.

Other symbols such as musical notation are also included in the character repertoire. Both the Unicode and GB18030 standards have a character repertoire. As new characters are added to one standard, the other standard also adds those characters, to maintain parity.

The code unit size is equivalent to the bit measurement for the particular encoding:

* A code unit in US-ASCII consists of 7 bits;
* A code unit in UTF-8, EBCDIC and GB18030 consists of 8 bits;
* A code unit in UTF-16 consists of 16 bits;
* A code unit in UTF-32 consists of 32 bits.

<a name="h3"/>

**USEFULL LINKS**

**History and information:**

https://en.wikipedia.org/wiki/Character_encoding


