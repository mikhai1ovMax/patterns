package com.mikhai1ovmax.behavioral.iterator;

import java.util.List;

public class Builder implements Collection{
    private String[] tools;

    public String[] getTools() {
        return tools;
    }

    public void setTools(String[] tools) {
        this.tools = tools;
    }

    public Builder(String[] tools) {
        this.tools = tools;
    }

    @Override
    public Iterator getIterator() {
        return new ToolsIterator();
    }

    private class ToolsIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            if(index < tools.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            return tools[index++];
        }
    }
}
