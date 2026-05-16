# DSL Assignment 1 Work Repo — Agent Instructions

This repository is for **2IMP20 Domain Specific Language Design — Assignment 1**.

## Scope

Build the LaBouR assignment deliverables:

1. An **Ecore metamodel** for the LaBouR bouldering-wall DSL.
2. A **QVTo transformation** from LaBouR models to the supplied `nl.tue.dsldesign.turtle` target metamodel.
3. At least one dynamic XMI input model with **3+ holds and a split**.
4. The generated output XMI model.

Assignment reference in the wiki:

- `/Users/konstantinstoyanov/Documents/uni-wiki/projects/dsl-assignment-1.md`
- `/Users/konstantinstoyanov/Documents/uni-wiki/sources/miinfosec-y2-q4-domain-specific-language-design-assignment-1.md`

## Repository conventions

- Do not commit generated build/cache folders unless they are required for submission.
- Prefer clear names matching the assignment language: `BoulderingWall`, `Volume`, `Circle`, `Triangle`, `Hold`, `Route`, `RouteStep`, `SplitStep`.
- Add explanatory comments in `.ecore` and `.qvto`; the rubric awards points for reasoning.
- Preserve the supplied turtle metamodel unchanged if copied into the workspace.

## Expected structure

Suggested layout:

```text
.
├── AGENTS.md
├── labouR.metamodel/          # Ecore project
├── labouR.transform/          # QVTo project
├── models/                    # input/output XMI examples, if not stored inside Eclipse projects
└── notes/                     # scratch notes, optional
```

## Design reminders

- Use a single root class composing the LaBouR model.
- Holds should be owned by volumes; routes should reference holds rather than duplicate them.
- Represent route splits explicitly enough that the transformation can visit both sub-routes.
- No OCL constraints are required; encode what Ecore can naturally express and document the rest.
- For each hop, generate turtle statements that reset orientation, compute/represent `dx` and `dy`, rotate correctly, and move the Euclidean distance.

## Deadline

Submit the zipped Eclipse projects and required models on Canvas by **2026-05-19 23:59**.
