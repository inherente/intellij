WHENEVER SQLERROR CONTINUE

DROP INDEX Nothing_Element_IDX;
DROP TABLE Nothing_Element CASCADE CONSTRAINTS;
DROP SEQUENCE SEQ_Nothing_Element_Id;

WHENEVER SQLERROR EXIT SQL.SQLCODE

CREATE SEQUENCE SEQ_NOTHING_ELEMENT_ID INCREMENT BY 1 START WITH 1 MAXVALUE 1000000000 MINVALUE 1;
CREATE TABLE Nothing_Element (
    Element_id NUMBER NOT NULL,
    description VARCHAR2(1024) NOT NULL,
    last_Updt_By VARCHAR2(1024) NOT NULL,
    last_Upd_Dt Date NOT NULL,
    CONSTRAINT Nothing_Element_PK PRIMARY KEY (Element_id)
    USING INDEX (CREATE UNIQUE INDEX Nothing_Element_PK ON Nothing_Element (Element_id))
);

CREATE OR REPLACE TRIGGER Nothing_Element_autoincrement 
BEFORE INSERT ON Nothing_Element 
FOR EACH ROW

BEGIN
  SELECT SEQ_NOTHING_ELEMENT_ID.NEXTVAL
  INTO :new.Element_id
  FROM dual;
END;
/
COMMIT;